package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YU device specifications for Android Compose previews.
 *
 * This extension provides YU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YU: Any
  get() = object {
      /** DeviceSpec(manufacturer=YU, code=YU4711, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YU, code=YU4711, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YU4711 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YU, code=YU5011, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YU, code=YU5011, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YU5011 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YU, code=YU5012, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YU, code=YU5012, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YU5012 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YU, code=YU5014, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YU, code=YU5014, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val YU5014 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YU, code=YU5040, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YU, code=YU5040, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val YU5040 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=YU, code=YU6000, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YU, code=YU6000, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val YU6000 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=YU, code=YUNICORN, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YU, code=YUNICORN, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val YUNICORN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=YU, code=YUPHORIA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YU, code=YUPHORIA, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YUPHORIA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YU, code=YUREKA, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YU, code=YUREKA, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val YUREKA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=YU, code=YUREKA2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YU, code=YUREKA2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val YUREKA2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=YU, code=YUREKAS, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YU, code=YUREKAS, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val YUREKAS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=YU, code=YUTOPIA, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YU, code=YUTOPIA, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val YUTOPIA = "spec:width=1440,height=2560,unit=px,dpi=640"

  }
