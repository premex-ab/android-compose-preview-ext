package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Kempler_Strauss device specifications for Android Compose previews.
 *
 * This extension provides Kempler_Strauss device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KemplerStrauss.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KemplerStrauss: Any
  get() = object {
      /** Kempler_Strauss Alumini_3_Plus */
      val ALUMINI_3_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
