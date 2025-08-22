package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZATEC device specifications for Android Compose previews.
 *
 * This extension provides ZATEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZATEC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZATEC: Any
  get() = object {
      /** ZATEC JOY */
      val JOY = "spec:width=480,height=996,unit=px,dpi=240"

      /** ZATEC JOY_PLUS */
      val JOY_PLUS = "spec:width=480,height=996,unit=px,dpi=240"

      /** ZATEC WIND */
      val WIND = "spec:width=480,height=960,unit=px,dpi=240"

      /** ZATEC ZATEC_Zpower_2018 */
      val ZATEC_ZPOWER_2018 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ZATEC ZPAD_1 */
      val ZPAD_1 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
