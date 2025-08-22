package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * att device specifications for Android Compose previews.
 *
 * This extension provides att device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Att.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Att: Any
  get() = object {
      /** att v340u */
      val V340U = "spec:width=720,height=1440,unit=px,dpi=320"

      /** att v341u */
      val V341U = "spec:width=720,height=1440,unit=px,dpi=320"

      /** att v350u */
      val V350U = "spec:width=720,height=1520,unit=px,dpi=320"

  }
