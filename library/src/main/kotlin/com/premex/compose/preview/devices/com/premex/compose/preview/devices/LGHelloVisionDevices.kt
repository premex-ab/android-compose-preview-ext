package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LGHelloVision device specifications for Android Compose previews.
 *
 * This extension provides LGHelloVision device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LGHelloVision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LGHelloVision: Any
  get() = object {
      /** DeviceSpec(manufacturer=LGHelloVision, code=K1100UA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LGHelloVision, code=K1100UA,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val K1100UA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LGHelloVision, code=K1200UA, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LGHelloVision, code=K1200UA,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val K1200UA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LGHelloVision, code=uce4027cjh, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LGHelloVision, code=uce4027cjh,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val UCE4027CJH = "spec:width=720,height=1280,unit=px,dpi=213"

  }
