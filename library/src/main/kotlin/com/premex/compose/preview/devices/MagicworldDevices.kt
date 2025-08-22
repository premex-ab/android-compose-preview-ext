package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAGICworld device specifications for Android Compose previews.
 *
 * This extension provides MAGICworld device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Magicworld.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Magicworld: Any
  get() = object {
      /** MAGICworld longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
