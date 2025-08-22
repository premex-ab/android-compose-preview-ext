package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TASKPHONE device specifications for Android Compose previews.
 *
 * This extension provides TASKPHONE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TASKPHONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TASKPHONE: Any
  get() = object {
      /** DeviceSpec(manufacturer=TASKPHONE, code=T20P, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TASKPHONE, code=T20P, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val T20P = "spec:width=720,height=1440,unit=px,dpi=320"

  }
