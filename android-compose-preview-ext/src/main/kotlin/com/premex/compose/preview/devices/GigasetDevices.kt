package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Gigaset device specifications for Android Compose previews.
 *
 * This extension provides Gigaset device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gigaset.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gigaset: Any
  get() = object {
      /** Gigaset FG6Q */
      val FG6Q = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** Gigaset Gigaset_GS270 */
      val GIGASET_GS270 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Gigaset Gigaset_GS270_plus */
      val GIGASET_GS270_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Gigaset Gigaset_GS4 */
      val GIGASET_GS4 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Gigaset GS100 */
      val GS100 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Gigaset GS110 */
      val GS110 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** Gigaset GS160 */
      val GS160 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Gigaset GS170 */
      val GS170 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Gigaset GS180 */
      val GS180 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Gigaset GS185 */
      val GS185 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Gigaset GS190 */
      val GS190 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Gigaset GS195 */
      val GS195 = "spec:width=1080,height=2246,unit=px,dpi=400"

      /** Gigaset GS280 */
      val GS280 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Gigaset GS290 */
      val GS290 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Gigaset GS3 */
      val GS3 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Gigaset GS370 */
      val GS370 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Gigaset GS370_Plus */
      val GS370_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Gigaset GS5 */
      val GS5 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Gigaset GS5_LITE */
      val GS5_LITE = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Gigaset GS5_Senior */
      val GS5_SENIOR = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Gigaset GS80 */
      val GS80 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Gigaset GX290 */
      val GX290 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Gigaset GX4 */
      val GX4 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Gigaset GX4_PRO */
      val GX4_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Gigaset GX6 */
      val GX6 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** Gigaset GX6_PRO */
      val GX6_PRO = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** Gigaset lion_s */
      val LION_S = "spec:width=320,height=480,unit=px,dpi=160"

      /** Gigaset maxwell_10 */
      val MAXWELL_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Gigaset ME */
      val ME = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Gigaset MEpro */
      val MEPRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Gigaset UY8 */
      val UY8 = "spec:width=768,height=1024,unit=px,dpi=160"

  }
