package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IIIF150 device specifications for Android Compose previews.
 *
 * This extension provides IIIF150 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IIIF150.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IIIF150: Any
  get() = object {
      /** DeviceSpec(manufacturer=IIIF150, code=Air1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=Air1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val AIR1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=IIIF150, code=Air1_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=Air1_Pro, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val AIR1_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=IIIF150, code=Air1_Ultra, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=Air1_Ultra,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val AIR1_ULTRA = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=IIIF150, code=Air1_Ultra_Pro, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=Air1_Ultra_Pro,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val AIR1_ULTRA_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=IIIF150, code=Air3, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=Air3, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val AIR3 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IIIF150, code=Air3S, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=Air3S, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val AIR3S = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=IIIF150, code=B1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=B1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val B1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=IIIF150, code=B1_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=B1_Pro, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val B1_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=IIIF150, code=B2, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=B2, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val B2 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=IIIF150, code=B2_Pro, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=B2_Pro, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val B2_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=IIIF150, code=B2_Ultra, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=B2_Ultra, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val B2_ULTRA = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=IIIF150, code=B3, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=B3, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val B3 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IIIF150, code=B3C, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=B3C, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val B3C = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=IIIF150, code=Raptor, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IIIF150, code=Raptor, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val RAPTOR = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
