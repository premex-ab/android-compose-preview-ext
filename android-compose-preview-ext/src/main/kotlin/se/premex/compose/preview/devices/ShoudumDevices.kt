package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * shoudum device specifications for Android Compose previews.
 *
 * This extension provides shoudum device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Shoudum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Shoudum: Any
  get() = object {
      /** shoudum X50 */
      val X50 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** shoudum X50US */
      val X50US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** shoudum X_50 */
      val X_50 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** shoudum X_50_EEA */
      val X_50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
