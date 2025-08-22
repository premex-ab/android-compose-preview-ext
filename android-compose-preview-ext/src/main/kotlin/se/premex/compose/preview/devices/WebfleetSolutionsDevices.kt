package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Webfleet_Solutions device specifications for Android Compose previews.
 *
 * This extension provides Webfleet_Solutions device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WebfleetSolutions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WebfleetSolutions: Any
  get() = object {
      /** Webfleet_Solutions triton */
      val TRITON = "spec:width=600,height=1024,unit=px,dpi=160"

  }
