package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SocialPhone_700 device specifications for Android Compose previews.
 *
 * This extension provides SocialPhone_700 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SocialPhone700.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SocialPhone700: Any
  get() = object {
      /** DeviceSpec(manufacturer=SocialPhone_700, code=Tablet_DL_3420, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SocialPhone_700,
      code=Tablet_DL_3420, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TABLET_DL_3420 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
