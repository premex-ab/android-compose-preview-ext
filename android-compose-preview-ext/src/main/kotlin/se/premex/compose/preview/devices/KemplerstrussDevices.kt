package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KemplerStruss device specifications for Android Compose previews.
 *
 * This extension provides KemplerStruss device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kemplerstruss.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kemplerstruss: Any
  get() = object {
      /** KemplerStruss gangbyeon */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KemplerStruss kanda */
      val KANDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
