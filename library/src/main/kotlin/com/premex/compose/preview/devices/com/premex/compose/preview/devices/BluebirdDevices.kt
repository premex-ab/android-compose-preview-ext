package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bluebird device specifications for Android Compose previews.
 *
 * This extension provides Bluebird device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bluebird.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bluebird: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bluebird, code=BM180, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=BM180, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BM180 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bluebird, code=CF550, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=CF550, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CF550 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bluebird, code=EF400, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=EF400, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val EF400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bluebird, code=EF401, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=EF401, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val EF401 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bluebird, code=EF500, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=EF500, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EF500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bluebird, code=EF501, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=EF501, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EF501 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bluebird, code=EF550, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=EF550, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val EF550 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bluebird, code=EF550R, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=EF550R, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val EF550R = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bluebird, code=EF551, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=EF551, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val EF551 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Bluebird, code=HF550, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=HF550, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HF550 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bluebird, code=RP350, width=320, height=480, dpi=150,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=RP350, width=320,
      height=480, dpi=150, isGoogleDevice=false).code */
      val RP350 = "spec:width=320,height=480,unit=px,dpi=150"

      /** DeviceSpec(manufacturer=Bluebird, code=RT080, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=RT080, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RT080 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bluebird, code=RT103, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=RT103, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RT103 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Bluebird, code=S20, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=S20, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val S20 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Bluebird, code=SF550, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=SF550, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SF550 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Bluebird, code=SF650, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=SF650, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val SF650 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Bluebird, code=ST103, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=ST103, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ST103 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bluebird, code=VF550, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=VF550, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val VF550 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bluebird, code=VX500, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bluebird, code=VX500, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VX500 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
