package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * E_Wealth_Mobile device specifications for Android Compose previews.
 *
 * This extension provides E_Wealth_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EWealthMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EWealthMobile: Any
  get() = object {
      /** E_Wealth_Mobile E5701 */
      val E5701 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
