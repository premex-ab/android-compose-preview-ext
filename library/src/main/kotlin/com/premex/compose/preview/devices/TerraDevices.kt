package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Terra device specifications for Android Compose previews.
 *
 * This extension provides Terra device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Terra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Terra: Any
  get() = object {
      /** Terra TERRA_MOBILE_PAD_1200 */
      val TERRA_MOBILE_PAD_1200 = "spec:width=1280,height=1920,unit=px,dpi=240"

      /** Terra TERRA_PAD_1200_V2 */
      val TERRA_PAD_1200_V2 = "spec:width=1280,height=1920,unit=px,dpi=240"

  }
