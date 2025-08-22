package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Starlight device specifications for Android Compose previews.
 *
 * This extension provides Starlight device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Starlight.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Starlight: Any
  get() = object {
      /** Starlight C_Note */
      val C_NOTE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Starlight C_Note_Pro */
      val C_NOTE_PRO = "spec:width=480,height=996,unit=px,dpi=240"

      /** Starlight Gionee_Star */
      val GIONEE_STAR = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Starlight I_Star_Plus */
      val I_STAR_PLUS = "spec:width=640,height=1280,unit=px,dpi=240"

      /** Starlight I_star_two */
      val I_STAR_TWO = "spec:width=480,height=960,unit=px,dpi=240"

      /** Starlight Milan_2G */
      val MILAN_2G = "spec:width=600,height=1280,unit=px,dpi=240"

      /** Starlight My_Star_X */
      val MY_STAR_X = "spec:width=480,height=960,unit=px,dpi=240"

      /** Starlight Safari */
      val SAFARI = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Starlight STAR_MIX */
      val STAR_MIX = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Starlight Star_Mix_2 */
      val STAR_MIX_2 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Starlight Star_Plus */
      val STAR_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Starlight UMI_G */
      val UMI_G = "spec:width=720,height=1280,unit=px,dpi=272"

  }
