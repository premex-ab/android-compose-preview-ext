package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * inefi device specifications for Android Compose previews.
 *
 * This extension provides inefi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Inefi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Inefi: Any
  get() = object {
      /** inefi Android_G17 */
      val ANDROID_G17 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
