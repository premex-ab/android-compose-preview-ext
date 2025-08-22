package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Webee device specifications for Android Compose previews.
 *
 * This extension provides Webee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Webee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Webee: Any
  get() = object {
      /** Webee Webee_Tab_8 */
      val WEBEE_TAB_8 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
