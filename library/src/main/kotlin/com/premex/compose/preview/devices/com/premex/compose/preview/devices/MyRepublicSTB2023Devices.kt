package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MyRepublic_STB_2023 device specifications for Android Compose previews.
 *
 * This extension provides MyRepublic_STB_2023 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MyRepublicSTB2023.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MyRepublicSTB2023: Any
  get() = object {
      /** DeviceSpec(manufacturer=MyRepublic_STB_2023, code=B866V2FAV3, width=720, height=1280,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyRepublic_STB_2023,
      code=B866V2FAV3, width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val B866V2FAV3 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
