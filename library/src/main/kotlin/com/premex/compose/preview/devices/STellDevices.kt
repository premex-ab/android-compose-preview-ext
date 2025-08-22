package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * S_TELL device specifications for Android Compose previews.
 *
 * This extension provides S_TELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STell: Any
  get() = object {
      /** S_TELL M630 */
      val M630 = "spec:width=480,height=960,unit=px,dpi=240"

      /** S_TELL P760 */
      val P760 = "spec:width=640,height=1280,unit=px,dpi=320"

  }
