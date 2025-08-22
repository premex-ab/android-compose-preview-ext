package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * StarkFuture device specifications for Android Compose previews.
 *
 * This extension provides StarkFuture device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.StarkFuture.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.StarkFuture: Any
  get() = object {
      /** StarkFuture ARKENSTONE */
      val ARKENSTONE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** StarkFuture ARKENSTONE_US */
      val ARKENSTONE_US = "spec:width=720,height=1612,unit=px,dpi=320"

  }
