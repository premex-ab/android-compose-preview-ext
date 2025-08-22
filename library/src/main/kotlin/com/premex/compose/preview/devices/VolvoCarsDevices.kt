package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VolvoCars device specifications for Android Compose previews.
 *
 * This extension provides VolvoCars device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VolvoCars.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VolvoCars: Any
  get() = object {
      /** VolvoCars habanero */
      val HABANERO = "spec:width=1200,height=1600,unit=px,dpi=180"

      /** VolvoCars ihu_abl_car */
      val IHU_ABL_CAR = "spec:width=768,height=1024,unit=px,dpi=140"

      /** VolvoCars moose */
      val MOOSE = "spec:width=1600,height=2560,unit=px,dpi=200"

  }
