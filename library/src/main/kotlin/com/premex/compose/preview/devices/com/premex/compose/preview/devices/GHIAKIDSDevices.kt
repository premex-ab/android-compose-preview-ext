package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GHIA_KIDS device specifications for Android Compose previews.
 *
 * This extension provides GHIA_KIDS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GHIAKIDS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GHIAKIDS: Any
  get() = object {
      /** DeviceSpec(manufacturer=GHIA_KIDS, code=GTKIDS7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA_KIDS, code=GTKIDS7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTKIDS7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
