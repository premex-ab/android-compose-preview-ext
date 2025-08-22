package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Apolosign device specifications for Android Compose previews.
 *
 * This extension provides Apolosign device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Apolosign.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Apolosign: Any
  get() = object {
      /** DeviceSpec(manufacturer=Apolosign, code=AP2718T, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=AP2718T,
      width=1080, height=1920, dpi=160, isGoogleDevice=false).code */
      val AP2718T = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Apolosign, code=EM101A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=EM101A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EM101A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Apolosign, code=EM101C, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=EM101C, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EM101C = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Apolosign, code=EM103A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=EM103A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EM103A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Apolosign, code=EP103B, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=EP103B, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EP103B = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Apolosign, code=EP1095T, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=EP1095T, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val EP1095T = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Apolosign, code=FA158AT, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=FA158AT,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val FA158AT = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Apolosign, code=K109A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=K109A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K109A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Apolosign, code=K109_Pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=K109_Pro,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val K109_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Apolosign, code=K709A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=K709A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K709A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Apolosign, code=NW1495T, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=NW1495T,
      width=1080, height=1920, dpi=160, isGoogleDevice=false).code */
      val NW1495T = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Apolosign, code=WF2189T, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=WF2189T,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val WF2189T = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Apolosign, code=WF2489T, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=WF2489T,
      width=2160, height=3840, dpi=480, isGoogleDevice=false).code */
      val WF2489T = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Apolosign, code=WF3289T, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Apolosign, code=WF3289T,
      width=2160, height=3840, dpi=480, isGoogleDevice=false).code */
      val WF3289T = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
