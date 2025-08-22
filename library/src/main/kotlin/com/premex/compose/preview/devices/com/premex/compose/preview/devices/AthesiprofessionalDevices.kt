package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Athesi_professional device specifications for Android Compose previews.
 *
 * This extension provides Athesi_professional device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Athesiprofessional.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Athesiprofessional: Any
  get() = object {
      /** DeviceSpec(manufacturer=Athesi_professional, code=AP5702, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Athesi_professional, code=AP5702,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val AP5702 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
