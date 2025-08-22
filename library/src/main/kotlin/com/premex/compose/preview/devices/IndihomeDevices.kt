package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IndiHome device specifications for Android Compose previews.
 *
 * This extension provides IndiHome device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Indihome.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Indihome: Any
  get() = object {
      /** IndiHome B866FV1_1 */
      val B866FV1_1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** IndiHome HG680 */
      val HG680 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
