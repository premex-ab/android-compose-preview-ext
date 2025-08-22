package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * YQSAVIOR device specifications for Android Compose previews.
 *
 * This extension provides YQSAVIOR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yqsavior.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yqsavior: Any
  get() = object {
      /** YQSAVIOR Q2K */
      val Q2K = "spec:width=600,height=1024,unit=px,dpi=160"

      /** YQSAVIOR YQ10S */
      val YQ10S = "spec:width=800,height=1280,unit=px,dpi=213"

  }
