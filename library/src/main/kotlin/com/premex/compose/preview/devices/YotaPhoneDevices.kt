package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YotaPhone device specifications for Android Compose previews.
 *
 * This extension provides YotaPhone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YotaPhone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YotaPhone: Any
  get() = object {
      /** YotaPhone yotaphone2 */
      val YOTAPHONE2 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
