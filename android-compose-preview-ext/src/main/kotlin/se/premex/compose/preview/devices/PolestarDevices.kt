package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Polestar device specifications for Android Compose previews.
 *
 * This extension provides Polestar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Polestar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Polestar: Any
  get() = object {
      /** Polestar ihu_abl_car */
      val IHU_ABL_CAR = "spec:width=1152,height=1536,unit=px,dpi=180"

      /** Polestar jalapeno */
      val JALAPENO = "spec:width=1200,height=1920,unit=px,dpi=140"

      /** Polestar moose */
      val MOOSE = "spec:width=1600,height=2560,unit=px,dpi=200"

  }
