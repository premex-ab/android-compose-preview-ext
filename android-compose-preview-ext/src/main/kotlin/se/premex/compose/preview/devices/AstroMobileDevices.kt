package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Astro_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Astro_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AstroMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AstroMobile: Any
  get() = object {
      /** Astro_Mobile Smart_A1_Plus */
      val SMART_A1_PLUS = "spec:width=480,height=960,unit=px,dpi=200"

  }
