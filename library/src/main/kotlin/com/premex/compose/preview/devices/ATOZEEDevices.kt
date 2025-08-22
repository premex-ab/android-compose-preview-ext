package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATOZEE device specifications for Android Compose previews.
 *
 * This extension provides ATOZEE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATOZEE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATOZEE: Any
  get() = object {
      /** ATOZEE A30MAX */
      val A30MAX = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** ATOZEE AT10K */
      val AT10K = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATOZEE AT11K */
      val AT11K = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ATOZEE AT12K */
      val AT12K = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ATOZEE AT71K */
      val AT71K = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ATOZEE AT81K */
      val AT81K = "spec:width=800,height=1280,unit=px,dpi=180"

      /** ATOZEE CP10S */
      val CP10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATOZEE CP20S */
      val CP20S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATOZEE CP20_GOLD */
      val CP20_GOLD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATOZEE CP20_MAX */
      val CP20_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATOZEE CP20_PRO */
      val CP20_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATOZEE CP30 */
      val CP30 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ATOZEE CP31 */
      val CP31 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ATOZEE CP80 */
      val CP80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ATOZEE CP80KS */
      val CP80KS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ATOZEE CP81 */
      val CP81 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ATOZEE NV10S */
      val NV10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATOZEE P12 */
      val P12 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** ATOZEE P70W */
      val P70W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ATOZEE P80W */
      val P80W = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** ATOZEE P81W */
      val P81W = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** ATOZEE Q2S */
      val Q2S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ATOZEE Q2SK */
      val Q2SK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ATOZEE T30MAX */
      val T30MAX = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** ATOZEE T30MAX_EEA */
      val T30MAX_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** ATOZEE YQ10SK */
      val YQ10SK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATOZEE YQ10S_Gold */
      val YQ10S_GOLD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATOZEE YQ10S_MAX */
      val YQ10S_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATOZEE ZB10S */
      val ZB10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATOZEE ZB11S */
      val ZB11S = "spec:width=800,height=1280,unit=px,dpi=160"

  }
