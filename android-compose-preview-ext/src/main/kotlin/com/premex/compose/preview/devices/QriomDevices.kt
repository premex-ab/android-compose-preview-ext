package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QRIOM device specifications for Android Compose previews.
 *
 * This extension provides QRIOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qriom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qriom: Any
  get() = object {
      /** QRIOM lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** QRIOM minami */
      val MINAMI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** QRIOM mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

  }
