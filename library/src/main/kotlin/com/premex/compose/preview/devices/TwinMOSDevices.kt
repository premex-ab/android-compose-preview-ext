package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TwinMOS device specifications for Android Compose previews.
 *
 * This extension provides TwinMOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TwinMOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TwinMOS: Any
  get() = object {
      /** TwinMOS MQ703G */
      val MQ703G = "spec:width=600,height=1024,unit=px,dpi=220"

      /** TwinMOS MQ703G_1 */
      val MQ703G_1 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
