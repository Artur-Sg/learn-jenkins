import React from 'react';
import { render } from '@testing-library/react';
import App from './App';

test('renders learn react link', () => {
  const { getByText } = render(<App />);
  const linkElement = getByText(/If you see this, Jenkins build successful!/i);
  expect(linkElement).toBeInTheDocument();
});
