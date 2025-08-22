package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * InnJoo device specifications for Android Compose previews.
 *
 * This extension provides InnJoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.InnJoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.InnJoo: Any
  get() = object {
      /** DeviceSpec(manufacturer=InnJoo, code=F106_Plus, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InnJoo, code=F106_Plus, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F106_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

  }
