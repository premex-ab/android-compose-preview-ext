package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cellacom device specifications for Android Compose previews.
 *
 * This extension provides Cellacom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cellacom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cellacom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cellacom, code=Cellacom_S62, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellacom, code=Cellacom_S62,
      width=600, height=1280, dpi=240, isGoogleDevice=false).code */
      val CELLACOM_S62 = "spec:width=600,height=1280,unit=px,dpi=240"

  }
