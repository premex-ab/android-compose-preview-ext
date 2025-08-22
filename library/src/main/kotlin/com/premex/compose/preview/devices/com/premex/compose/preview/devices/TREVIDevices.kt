package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TREVI device specifications for Android Compose previews.
 *
 * This extension provides TREVI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TREVI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TREVI: Any
  get() = object {
      /** DeviceSpec(manufacturer=TREVI, code=KIDTAB_7_S04, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TREVI, code=KIDTAB_7_S04,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val KIDTAB_7_S04 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
