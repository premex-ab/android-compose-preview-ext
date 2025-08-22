package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLUEWORLD device specifications for Android Compose previews.
 *
 * This extension provides BLUEWORLD device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BLUEWORLD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BLUEWORLD: Any
  get() = object {
      /** DeviceSpec(manufacturer=BLUEWORLD, code=TM12, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLUEWORLD, code=TM12, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val TM12 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
