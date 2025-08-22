package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZCS device specifications for Android Compose previews.
 *
 * This extension provides ZCS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zcs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zcs: Any
  get() = object {
      /** ZCS Z91 */
      val Z91 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** ZCS Z92 */
      val Z92 = "spec:width=720,height=1280,unit=px,dpi=240"

  }
