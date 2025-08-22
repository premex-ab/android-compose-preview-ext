package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AOC device specifications for Android Compose previews.
 *
 * This extension provides AOC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AOC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AOC: Any
  get() = object {
      /** AOC A110_E */
      val A110_E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AOC AOC_WW */
      val AOC_WW = "spec:width=672,height=1280,unit=px,dpi=160"

      /** AOC hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AOC khardi */
      val KHARDI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AOC mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AOC PH0M_EA_T32 */
      val PH0M_EA_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AOC PH3M_AL_T32 */
      val PH3M_AL_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AOC Q10107LW-ME */
      val Q10107LW_ME = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AOC Q10107L-ME */
      val Q10107L_ME = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AOC Q8108L-ME */
      val Q8108L_ME = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AOC wulong */
      val WULONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
