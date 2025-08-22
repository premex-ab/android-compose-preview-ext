package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nook device specifications for Android Compose previews.
 *
 * This extension provides Nook device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nook.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nook: Any
  get() = object {
      /** Nook st16c7bnn */
      val ST16C7BNN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Nook st18c10bnn */
      val ST18C10BNN = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Nook st18c7bnn */
      val ST18C7BNN = "spec:width=600,height=1024,unit=px,dpi=160"

  }
