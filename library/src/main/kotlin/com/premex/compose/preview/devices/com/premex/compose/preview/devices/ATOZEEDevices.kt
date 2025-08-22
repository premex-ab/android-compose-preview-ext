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
      /** DeviceSpec(manufacturer=ATOZEE, code=A30MAX, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=A30MAX, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val A30MAX = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ATOZEE, code=AT10K, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=AT10K, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AT10K = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=AT11K, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=AT11K, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AT11K = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATOZEE, code=AT12K, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=AT12K, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AT12K = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATOZEE, code=AT71K, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=AT71K, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val AT71K = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=AT81K, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=AT81K, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val AT81K = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=ATOZEE, code=CP10S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=CP10S, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CP10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=CP20S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=CP20S, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CP20S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=CP20_GOLD, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=CP20_GOLD, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CP20_GOLD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=CP20_MAX, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=CP20_MAX, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CP20_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=CP20_PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=CP20_PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CP20_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=CP30, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=CP30, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CP30 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATOZEE, code=CP31, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=CP31, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CP31 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATOZEE, code=CP80, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=CP80, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CP80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATOZEE, code=CP80KS, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=CP80KS, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CP80KS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATOZEE, code=CP81, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=CP81, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CP81 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATOZEE, code=NV10S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=NV10S, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NV10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=P12, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=P12, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P12 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=ATOZEE, code=P70W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=P70W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P70W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATOZEE, code=P80W, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=P80W, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val P80W = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ATOZEE, code=P81W, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=P81W, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val P81W = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ATOZEE, code=Q2S, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=Q2S, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q2S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=Q2SK, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=Q2SK, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q2SK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=T30MAX, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=T30MAX, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T30MAX = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ATOZEE, code=T30MAX_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=T30MAX_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val T30MAX_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ATOZEE, code=YQ10SK, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=YQ10SK, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val YQ10SK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=YQ10S_Gold, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=YQ10S_Gold, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val YQ10S_GOLD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=YQ10S_MAX, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=YQ10S_MAX, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val YQ10S_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=ZB10S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=ZB10S, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ZB10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATOZEE, code=ZB11S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOZEE, code=ZB11S, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ZB11S = "spec:width=800,height=1280,unit=px,dpi=160"

  }
