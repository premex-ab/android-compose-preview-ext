package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * C5_Mobile device specifications for Android Compose previews.
 *
 * This extension provides C5_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.C5Mobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.C5Mobile: Any
  get() = object {
      /** C5_Mobile noa_x2_Plus */
      val NOA_X2_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

  }
