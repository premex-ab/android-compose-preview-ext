package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ORINOQUIA device specifications for Android Compose previews.
 *
 * This extension provides ORINOQUIA device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ORINOQUIA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ORINOQUIA: Any
  get() = object {
      /** ORINOQUIA QAY221-U */
      val QAY221_U = "spec:width=320,height=480,unit=px,dpi=160"

  }
