package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PINOCCHIO device specifications for Android Compose previews.
 *
 * This extension provides PINOCCHIO device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PINOCCHIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PINOCCHIO: Any
  get() = object {
      /** PINOCCHIO SGWIFIPAD320093 */
      val SGWIFIPAD320093 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
