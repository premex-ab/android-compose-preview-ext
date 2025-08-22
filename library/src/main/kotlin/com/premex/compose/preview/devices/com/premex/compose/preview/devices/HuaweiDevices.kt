package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * huawei device specifications for Android Compose previews.
 *
 * This extension provides huawei device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Huawei.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Huawei: Any
  get() = object {
      /** DeviceSpec(manufacturer=huawei, code=sawfish, width=390, height=390, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=huawei, code=sawfish, width=390,
      height=390, dpi=320, isGoogleDevice=false).code */
      val SAWFISH = "spec:width=390,height=390,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=huawei, code=sawshark, width=390, height=390, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=huawei, code=sawshark, width=390,
      height=390, dpi=320, isGoogleDevice=false).code */
      val SAWSHARK = "spec:width=390,height=390,unit=px,dpi=320"

  }
