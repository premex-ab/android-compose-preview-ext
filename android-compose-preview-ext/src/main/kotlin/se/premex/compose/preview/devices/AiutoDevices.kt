package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * aiuto device specifications for Android Compose previews.
 *
 * This extension provides aiuto device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aiuto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aiuto: Any
  get() = object {
      /** aiuto AT1001 */
      val AT1001 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** aiuto AT1002 */
      val AT1002 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** aiuto AT702 */
      val AT702 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
