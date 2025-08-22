package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LGE device specifications for Android Compose previews.
 *
 * This extension provides LGE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LGE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LGE: Any
  get() = object {
      /** DeviceSpec(manufacturer=LGE, code=cayman, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LGE, code=cayman, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CAYMAN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LGE, code=tvg2a, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LGE, code=tvg2a, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TVG2A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LGE, code=woofer2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LGE, code=woofer2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val WOOFER2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
