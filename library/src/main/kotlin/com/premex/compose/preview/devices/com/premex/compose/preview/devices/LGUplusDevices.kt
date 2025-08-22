package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LGUplus device specifications for Android Compose previews.
 *
 * This extension provides LGUplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LGUplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LGUplus: Any
  get() = object {
      /** DeviceSpec(manufacturer=LGUplus, code=uie4057lgu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LGUplus, code=uie4057lgu,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UIE4057LGU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LGUplus, code=ute7057lgu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LGUplus, code=ute7057lgu,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UTE7057LGU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
