package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TP-LINK device specifications for Android Compose previews.
 *
 * This extension provides TP-LINK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TPLINK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TPLINK: Any
  get() = object {
      /** DeviceSpec(manufacturer=TP-LINK, code=QC601, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TP-LINK, code=QC601, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val QC601 = "spec:width=480,height=854,unit=px,dpi=240"

  }
