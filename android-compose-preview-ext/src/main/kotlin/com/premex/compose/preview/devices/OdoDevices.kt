package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ODO device specifications for Android Compose previews.
 *
 * This extension provides ODO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Odo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Odo: Any
  get() = object {
      /** ODO A7008 */
      val A7008 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
