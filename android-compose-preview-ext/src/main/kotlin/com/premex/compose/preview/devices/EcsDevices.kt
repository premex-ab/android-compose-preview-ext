package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ECS device specifications for Android Compose previews.
 *
 * This extension provides ECS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ecs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ecs: Any
  get() = object {
      /** ECS TU11MK2 */
      val TU11MK2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
